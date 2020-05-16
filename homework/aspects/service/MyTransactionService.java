package ru.kpfu.itis.aspect.service;

import org.springframework.stereotype.Service;
import ru.kpfu.itis.aspect.aspect.MyTransaction;

@Service
public class MyTransactionService {


        @MyTransaction
        public String uuid1(String uuid) {
            return "Hello";
        }

        @MyTransaction
        public String uuid2(String uuid){
            return "World!";
        }

}
