package org.example;

import dataStructure.Queue;

import java.util.Random;

public class FilaDeAtendimento {
    public static void main(String[] args) {
        int n = 5;
        var ramdom = new Random();
        int cliente = ramdom.nextInt(101);
        Queue queue = new Queue(cliente);
        System.out.println("Chegou o Cliente: " + cliente);
        // Simula Chegada dos Clientes
        for (int i = 2; i <= n; i++) {
            cliente = ramdom.nextInt(101);
            System.out.println("Chegou o Cliente: " + cliente);
            queue.enqueue(cliente);
        }
        // Atendimento dos clientes

       var node = queue.daqueue();
        while (node != null){
            System.out.println("Atendido o cliente: " + node.getValue());
            node = queue.daqueue();
        }
    }
}
