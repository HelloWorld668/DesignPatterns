package designpatterns.facade;

public class LetterProcessImpl implements  LetterProcess{
    @Override
    public void writeLetter(String content) {
        System.out.print(":"+content);
    }

    @Override
    public void writeEnvelope(String address) {

    }

    @Override
    public void letterIntoEnvelope() {

    }

    @Override
    public void sendLetter() {

    }
}
