import javax.swing.*;

/**
 * Created by jerry on 2017/3/28.
 */
public class HeavyComputationSimulator implements Runnable {

    private Thread myThread;
    private JProgressBar progressBar;
    private JLabel label;
    private boolean isExecuting; //true if the task is executing
    private int count = 0;

    public HeavyComputationSimulator(JProgressBar bar,JLabel label)
    {
        //TODO:initial the thread and assign GUI variables

    }

    public void startHeavyTask(){
        //TODO:start the thread here

    }
    public void resumeHeavyTask()
    {
        //TODO

    }
    public void pauseHeavyTask()
    {
        //TODO

    }

    public boolean isExecuting() {
        return isExecuting;
    }

    @Override
    public void run() {
        /**
         * TODO:
         * call pretendToBeBusy and update count value if task is executing
         * put Swing GUI modification inside SwingUtilities.invokeLater !!
         */

    }

    private void pretendToBeBusy()
    {
        /**Just imagine you are doing some heavy computation work
         * simulate by Thread.sleep
         */
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
