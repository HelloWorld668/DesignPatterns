package designpatterns.facade;

public interface LetterProcess {
    //写信
    void writeLetter(String content);
    //写信封
    void writeEnvelope(String address);
    //装信到信封
    void letterIntoEnvelope();
    //寄信
    void sendLetter();
}
