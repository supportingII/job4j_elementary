package ru.job4j.tracker;

public class StubInput implements Input {

    private String[] answer;
    private int position = 0;

    public StubInput(String[] answer) {
        this.answer = answer;
    }

    @Override
    public String askStr(String msg) {
        return answer[position++];
    }

    @Override
    public int askInt(String msg) {
        return Integer.parseInt(askStr(msg));
    }
}
