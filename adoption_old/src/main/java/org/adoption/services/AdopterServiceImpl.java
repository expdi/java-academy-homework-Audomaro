package org.adoption.services;
import org.adoption.dao.AdopterDAO;
import org.adoption.domain.Adopter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

@Service()
public class AdopterServiceImpl implements AdopterService {

    private final AdopterDAO adopters;

    public AdopterServiceImpl(AdopterDAO adopters) {
        this.adopters = adopters;
    }

    @Override
    public Adopter addAdopter(Adopter adopter) {
        adopters.insert(adopter);
        return adopter;
    }

    @Override
    public boolean removeAdopter(int id) {
        return adopters.delete(id);
    }

    @Override
    public boolean updateAdopter(Adopter newAdopter) {

        return adopters.update(newAdopter);
    }

    @Override
    public List<Adopter> findAll() {
        return adopters.findAll();
    }

    @Override
    public Adopter findByID(int id) {
        return adopters.findByID(id);
    }

    @Override
    public List<Adopter> findByName(String name) {
        return adopters.findByName(name);
    }

    @Override
    public List<Adopter> sortByAdoptionDate() {
        return adopters.sortByAdoptionDate();
    }

    @Override
    public List<Adopter> findBy(Predicate<Adopter> criteria) {
        return adopters.findBy(criteria);
    }

    @Override
    public List<Adopter> orderBy(Comparator<Adopter> comparator) {
        return adopters.orderBy(comparator);
    }
}