package com.csobotka.sfgpetclinic.bootstrap;

import com.csobotka.sfgpetclinic.model.Owner;
import com.csobotka.sfgpetclinic.model.Vet;
import com.csobotka.sfgpetclinic.services.OwnerService;
import com.csobotka.sfgpetclinic.services.VetService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader(OwnerService ownerService, VetService vetService) {
        this.ownerService = ownerService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setFirstName("Cole");
        owner2.setLastName("Sobotka");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setFirstName("William");
        vet1.setLastName("Sobotka");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setFirstName("Alex");
        vet2.setLastName("Williams");

        vetService.save(vet2);

        System.out.println("Bootstrapping data...");
    }
}
