import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionCancelListener implements ActionListener {
        private JTextField outField;


        public ActionCancelListener(JTextField outField) {
            this.outField = outField;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            outField.setText("");
        }
    }

