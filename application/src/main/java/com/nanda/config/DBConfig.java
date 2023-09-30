//package com.nanda.config;
//
//import com.nanda.dao.UserRepo;
//import com.nanda.model.User;
//import com.nanda.service.UserService;
//
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.jdbc.datasource.DriverManagerDataSource;
//import org.springframework.orm.hibernate5.HibernateTransactionManager;
//import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//
//
//import javax.persistence.EntityManagerFactory;
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//@EnableTransactionManagement
//
//public class DBConfig {
//
//    @Bean
//    public UserService userService(UserRepo userRepo) {
//        System.out.println("bean creation");
//        return new UserService(userRepo);
//    }
//
//    // connection
//    @Bean
//    public DataSource createDataSource() {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
//        dataSource.setUrl("jdbc:mysql://localhost:3306/");
//        dataSource.setUsername("root");
//        dataSource.setPassword("nands");
//        return dataSource;
//    }
//    // session
//    @Bean
//    public LocalSessionFactoryBean entityManagerFactory() {
//        LocalSessionFactoryBean em = new LocalSessionFactoryBean();
//        em.setDataSource(createDataSource());
//        em.setPackagesToScan("com.nanda.model"); // Replace with your package containing JPA entities
//        Properties properties = new Properties();
//        properties.setProperty("hibernate.dialect","org.hibernate.dialect.MySQLDialect");
//        properties.setProperty("hibernate.show_sql","true");
//        em.setHibernateProperties(properties);
//        return em;
//    }
//
//
////    @Bean
////    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
////        JpaTransactionManager transactionManager = new JpaTransactionManager();
////        transactionManager.setEntityManagerFactory(entityManagerFactory);
////        return transactionManager;
////    }
//
////    @Bean
////    public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
////        JpaTransactionManager transactionManager = new JpaTransactionManager();
////        transactionManager.setEntityManagerFactory(entityManagerFactory);
////        return transactionManager;
////    }
//
//    @Bean
//    public HibernateTransactionManager transactionManager() {
//        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
//        transactionManager.setSessionFactory(entityManagerFactory().getObject());
//        return transactionManager;
//    }
//
//    // transaction
//}
