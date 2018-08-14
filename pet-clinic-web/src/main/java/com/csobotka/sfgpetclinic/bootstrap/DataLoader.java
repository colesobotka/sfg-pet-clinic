package com.csobotka.sfgpetclinic.bootstrap;

import com.csobotka.sfgpetclinic.model.Owner;
import com.csobotka.sfgpetclinic.model.Vet;
import com.csobotka.sfgpetclinic.services.OwnerService;
import com.csobotka.sfgpetclinic.services.VetService;
import com.csobotka.sfgpetclinic.services.map.OwnerServiceMap;
import com.csobotka.sfgpetclinic.services.map.VetServiceMap;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final OwnerService ownerService;
    private final VetService vetService;

    public DataLoader() {
        ownerService = new OwnerServiceMap();
        vetService = new VetServiceMap();
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Michael");
        owner1.setLastName("Weston");

        ownerService.save(owner1);

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Cole");
        owner2.setLastName("Sobotka");

        ownerService.save(owner2);

        Vet vet1 = new Vet();
        vet1.setId(1L);
        vet1.setFirstName("William");
        vet1.setLastName("Sobotka");

        vetService.save(vet1);

        Vet vet2 = new Vet();
        vet2.setId(2L);
        vet2.setFirstName("Alex");
        vet2.setLastName("Williams");

        vetService.save(vet2);

        System.out.println("Bootstrapping data...");
    }
}
