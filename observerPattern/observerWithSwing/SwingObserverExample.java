public class SwingObserverExample {
  JFrame frame;
  public static void main(String[] args) {
    SwingObserverExample example = new SwingObserverExample();
    example.go();
  }

  public void go() {
    frame = new JFrame();

    JButton button = new JButton('Should I do it?!?!?');
    button.addActionListener(new AngelListener());
    button.addActionListener(new DevilListener());
  }

  class AngelListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      System.out.println("Don't do it!! you might regret it ;)");
    }
  }

  class AngelListener implements ActionListener {
    public void actionPerformed(ActionEvent event) {
      System.out.println("Do it and I'll love you");
    }
  }


}
