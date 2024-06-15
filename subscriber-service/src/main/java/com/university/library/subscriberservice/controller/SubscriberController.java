package com.university.library.subscriberservice.controller;

import com.university.library.subscriberservice.model.Subscriber;
import com.university.library.subscriberservice.repository.SubscriberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/subscribers")
public class SubscriberController {

    @Autowired
    private SubscriberRepository subscriberRepository;

    @GetMapping
    public List<Subscriber> getAllSubscribers() {
        return subscriberRepository.findAll();
    }

    @GetMapping("/{id}")
    public Subscriber getSubscriberById(@PathVariable Long id) {
        return subscriberRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Subscriber createSubscriber(@RequestBody Subscriber subscriber) {
        return subscriberRepository.save(subscriber);
    }

    @PutMapping("/{id}")
    public Subscriber updateSubscriber(@PathVariable Long id, @RequestBody Subscriber subscriberDetails) {
        Subscriber subscriber = subscriberRepository.findById(id).orElse(null);
        if (subscriber != null) {
            subscriber.setName(subscriberDetails.getName());
            subscriber.setType(subscriberDetails.getType());
            return subscriberRepository.save(subscriber);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteSubscriber(@PathVariable Long id) {
        subscriberRepository.deleteById(id);
    }
}
