package edu.kis.vh.nursery;

public class HanoiRhymer extends DefaultCountingOutRhymer {

    private int totalRejected = 0;

    public int reportRejected() {
        return totalRejected;
    }
    @Override
    public void countIn(final int in) {
        if (!callCheck() && in > lastElement())
            totalRejected++;
        else
            super.countIn(in);
    }
}
