package com.app.electronicsStore.DemoFileUpload;

import java.io.File;
import javax.imageio.stream.FileImageInputStream;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.electronicsStore.inventory.entities.Fabricant;
import com.app.electronicsStore.inventory.repository.FabricantRepo;
import reactor.test.StepVerifier;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class Demo {

    @Autowired
    FabricantRepo repo;
    
    @Test
    @Order(1)
    void testLoad(){
        try {
            File file= new File("testing_resources/descarga.jpeg");
            FileImageInputStream input= new FileImageInputStream(file);
            Fabricant f= new Fabricant();
            f.setCompany_name("wolswagen");
            f.setLogo(null);
        
            

            StepVerifier.create(
                repo.save(f)
            ).expectNextMatches(e-> e.getClass().equals(Fabricant.class))
            .verifyComplete();
            input.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    @Order(2)
    void testCountInDb(){
        StepVerifier.create(repo.findById(1L))
        .thenConsumeWhile(e-> {
            System.out.println(e);
            return true;
        })
        .verifyComplete();
    }


}
