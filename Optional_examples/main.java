package oop.Phtographer;

import java.util.Optional;

public class main {
    public static void main(String[] args) {
//just
        optional taker = new optional();
        Optional<TakePhoto> photo = taker.TakingSomePhotos();
        if (photo.isPresent()){
            photo.get();
            System.out.println("This photo looks great ");
        } else {
            System.out.println("bro what are u doing ");
        }


    }
}
