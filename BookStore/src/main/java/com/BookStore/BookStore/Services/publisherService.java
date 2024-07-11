package com.BookStore.BookStore.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.BookStore.BookStore.Model.publisher;
import com.BookStore.BookStore.Repository.PublisherRepository;

@Service
public class publisherService {

    @Autowired
    private PublisherRepository publisherRepository;

    public List<publisher> getAllPublishers() {
        return publisherRepository.findAll();
    }

    public publisher getPublisherById(Long id) {
        return publisherRepository.findById(id).orElse(null);
    }

    public publisher savePublisher(publisher publisher) {
        return publisherRepository.save(publisher);
    }

    public void deletePublisher(Long id) {
        publisherRepository.deleteById(id);
    }
}

