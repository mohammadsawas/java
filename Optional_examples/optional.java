package oop.Phtographer;

import oop.optional.OptionalLecture;

import java.util.Optional;
import java.util.Random;

//one class
public class optional {
    public Optional<TakePhoto> TakingSomePhotos(){
        if(iAmSick()){
            return Optional.empty();
        } else{
          return Optional.of(new TakePhoto());
        }
    }
    private boolean iAmSick() {
        Random randomGenerator = new Random();
        int number = randomGenerator.nextInt(10);
        return isEven(number);
    }
    private boolean isEven(int number) {
        return number % 2 == 0;
    }
}
