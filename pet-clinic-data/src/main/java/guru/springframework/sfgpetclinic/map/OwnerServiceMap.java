package guru.springframework.sfgpetclinic.map;


import guru.springframework.sfgpetclinic.model.*;
import guru.springframework.sfgpetclinic.services.OwnerService;


public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements OwnerService {

    @Override
    public void findByLastName(String lastName) {
    map.entrySet().stream().forEach(entity->  entity.getValue().getLastName().equals(lastName));
    //.filter(e->e.getValue().getLastName().equals(lastName));


    }
}
