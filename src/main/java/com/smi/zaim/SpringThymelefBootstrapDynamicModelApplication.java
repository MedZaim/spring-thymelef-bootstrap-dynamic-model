package com.smi.zaim;

import com.smi.zaim.entities.Country;
import com.smi.zaim.repositories.CantryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringThymelefBootstrapDynamicModelApplication implements CommandLineRunner {
    @Autowired
    private CantryRepo cantryRepo;
  /*  @Autowired
    private CantryService cantryService;*/
    public static void main(String[] args) {
        SpringApplication.run(SpringThymelefBootstrapDynamicModelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        cantryRepo.save(new Country(1,"Algeria","Algiers"));
        cantryRepo.save(new Country(2,"Morocco","Rabat"));
        cantryRepo.save(new Country(3,"Tunisia","Tunis"));
        cantryRepo.save(new Country(4,"Egypt","Cairo"));
        cantryRepo.save(new Country(5,"Mauritania","Nouakchott"));
        cantryRepo.save(new Country(6,"Mali","Bamako"));
        cantryRepo.save(new Country(7,"Niger","Niamey"));
        cantryRepo.save(new Country(8,"Chad","N'Djamena"));
        cantryRepo.save(new Country(9,"Sudan","Khartoum"));
        cantryRepo.save(new Country(10,"Libya","Tripoli"));
        cantryRepo.save(new Country(11,"Somalia","Mogadishu"));
        cantryRepo.save(new Country(12,"Djibouti","Djibouti"));
        cantryRepo.save(new Country(13,"Comoros","Moroni"));
        cantryRepo.save(new Country(14,"Mauritius","Port Louis"));
        cantryRepo.save(new Country(15,"Seychelles","Victoria"));
        cantryRepo.save(new Country(16,"Madagascar","Antananarivo"));
        cantryRepo.save(new Country(17,"Zimbabwe","Harare"));
        cantryRepo.save(new Country(18,"Zambia","Lusaka"));
        cantryRepo.save(new Country(19,"Angola","Luanda"));
        cantryRepo.save(new Country(20,"Namibia","Windhoek"));
        cantryRepo.save(new Country(21,"Botswana","Gaborone"));
        cantryRepo.save(new Country(22,"South Africa","Pretoria"));
        cantryRepo.save(new Country(23,"Lesotho","Maseru"));
        cantryRepo.save(new Country(24,"Swaziland","Mbabane"));
        cantryRepo.save(new Country(25,"Mozambique","Maputo"));
        cantryRepo.save(new Country(26,"Malawi","Lilongwe"));



    }
}
