
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Computer
 */
@Configuration
@EnableTransactionManagement
@ImportResource({"classpath:persistenceConfig.xml"})
public class PersistenceXMLConfig {
    
}
