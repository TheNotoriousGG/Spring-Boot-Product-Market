package ru.geekbrains.spring_less_web.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.geekbrains.spring_less_web.Model.Client;
import ru.geekbrains.spring_less_web.Repository.ClientRepository;
import ru.geekbrains.spring_less_web.Service.ClientService;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private ClientRepository clientRepository;

    @Autowired
    private ClientService service;

    @GetMapping("/client/all")
    public List<Client> getTest(){
        return clientRepository.getAllClients();
    }

    @GetMapping("/client/change_score")
    public void changeScore(@RequestParam Long clientId, @RequestParam Integer delta){
        service.changeScore(clientId, delta);
    }

    @PostMapping("/client/add")
    public void addClientPost(@RequestBody Client client){
        clientRepository.addClient(client);
    }



}
