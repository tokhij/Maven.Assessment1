package com.zipcodewilmington.assessment1.part3;

import com.sun.javafx.scene.control.skin.VirtualFlow;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    List<Pet> pets;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
    this.name = name;
    this.pets = new ArrayList<>();
    pets = (pets == null) ? new Pet[0] : pets;
    for (Pet p : pets){
        this.addPet(p);
    }
    }


    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        pet.setOwner(this);
        this.pets.add(pet);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        pet.setOwner(this);
        this.pets.remove(pet);
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return this.pets.contains(pet);
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
        int youngetPetAge = this.pets.get(0).getAge();
        for (Pet p : this.pets){
            youngetPetAge = (youngetPetAge > p.getAge()) ? p.getAge() : youngetPetAge;

        }
        return youngetPetAge;
    }


    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        int oldestPetAge = this.pets.get(0).getAge();

        for(Pet p : this.pets){
            oldestPetAge = (oldestPetAge < p.getAge()) ? p.getAge() : oldestPetAge;
        }

        return oldestPetAge;
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        float petAgeSum = 0;
        float petAgeAverage;
        for(Pet p : this.pets){
            petAgeSum += p.getAge();
        }
        petAgeAverage = petAgeSum/this.pets.size();
        return petAgeAverage;
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
        return pets.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        Pet[] petsArray = new Pet[this.pets.size()];
        return this.pets.toArray(petsArray);
    }
}
