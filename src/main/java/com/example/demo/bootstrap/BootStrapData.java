package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    private final InhousePartRepository inhousePartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, InhousePartRepository inhousePartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.inhousePartRepository = inhousePartRepository;
    }

    @Override
    public void run(String... args) throws Exception {


        OutsourcedPart whiteKeys = new OutsourcedPart();
        whiteKeys.setCompanyName("Ivory Inc.");
        whiteKeys.setName("White Keys");
        whiteKeys.setInv(20);
        whiteKeys.setPrice(100.0);
        whiteKeys.setId(100L);
        whiteKeys.setMaxInv(50);
        whiteKeys.setMinInv(1);

        OutsourcedPart blackKeys = new OutsourcedPart();
        blackKeys.setCompanyName("Ivory Inc.");
        blackKeys.setName("Black Keys");
        blackKeys.setInv(20);
        blackKeys.setPrice(70.0);
        blackKeys.setId(101L);
        blackKeys.setMaxInv(40);
        blackKeys.setMinInv(1);

        OutsourcedPart headPhones = new OutsourcedPart();
        headPhones.setCompanyName("Audio Warehouse");
        headPhones.setName("Over-the-ear Headphones");
        headPhones.setInv(20);
        headPhones.setPrice(75.0);
        headPhones.setId(102L);
        headPhones.setMaxInv(20);
        headPhones.setMinInv(1);

        InhousePart bench = new InhousePart();
        bench.setName("Bench");
        bench.setInv(20);
        bench.setPrice(50.0);
        bench.setId(103L);
        bench.setMaxInv(20);
        bench.setMinInv(1);

        InhousePart musicStand = new InhousePart();
        musicStand.setName("Music Stand");
        musicStand.setInv(20);
        musicStand.setPrice(20.0);
        musicStand.setId(104L);
        musicStand.setMaxInv(20);
        musicStand.setMinInv(1);


        if (outsourcedPartRepository.count() == 0) {
            outsourcedPartRepository.save(whiteKeys);
            outsourcedPartRepository.save(blackKeys);
            outsourcedPartRepository.save(headPhones);
        }

        if (inhousePartRepository.count() == 0) {
            inhousePartRepository.save(bench);
            inhousePartRepository.save(musicStand);
        }

//        OutsourcedPart thePart=null;
//        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            if(part.getName().equals("White Keys"))thePart=part;
//        }

//        System.out.println(thePart.getCompanyName());

//        outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
//        for(OutsourcedPart part:outsourcedParts){
//            System.out.println(part.getName()+" "+part.getCompanyName());
//        }

        Product grand = new Product("Grand",15000.0,5);
        Product digital = new Product("Digital",500.0,25);
        Product spinet = new Product("Spinet",1500.0,20);
        Product upright = new Product("Upright", 6000.0, 15);
        Product babyGrand = new Product("Baby Grand", 10000.0, 10);

        if (productRepository.count() == 0) {
            productRepository.save(babyGrand);
            productRepository.save(grand);
            productRepository.save(digital);
            productRepository.save(spinet);
            productRepository.save(upright);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
