package com.csobotka.sfgpetclinic.services;

import com.csobotka.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);

}
