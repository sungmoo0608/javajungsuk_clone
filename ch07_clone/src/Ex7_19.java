import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Ex7_19 {
	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ActionEvent occurred!!!");
			}
		}
		);
	}
}
