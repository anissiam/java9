package oop.Files;

import oop.basics.Car;

import java.io.*;

public class Files {
    public static void main(String[] args) {
        //File file = new File("Hello.txt");
        //File file = new File("Hello1.txt");
        File file = new File("Hello2.txt");
        //System.out.println(file.getAbsolutePath());
        //file.delete();
        //file.isDirectory();
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

 Car car = new Car();
        car.name = "BMW";
        car.color = "RED";
        car.maxSpeed = 100;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(car);
            objectOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Car car1 =(Car) objectInputStream.readObject();
            car1.printCar();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
















       /* try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write("Hello From Java Class".getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/


        /*try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int c = fileInputStream.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fileInputStream.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
*/




















       /* char[] chars = {'J', 'A', 'V', 'A'};
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Hello my name is anis\n");
            fileWriter.write(65);
            fileWriter.write('B');
            fileWriter.write("\n");
            fileWriter.write(chars);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/


        /*try {
            FileReader fileReader = new FileReader(file);
            int c = fileReader.read();
            while (c != -1) {
                System.out.print((char) c);
                c = fileReader.read();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/

    }
}
