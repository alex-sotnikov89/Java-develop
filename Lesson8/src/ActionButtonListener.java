
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionButtonListener implements ActionListener {
    private JTextField outField;
    private StringBuilder sb;
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");

    public ActionButtonListener(JTextField outField) {
        this.outField = outField;
        this.sb = new StringBuilder();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton jButton = (JButton) e.getSource();
        if (jButton.getText() == "C") {
            outField.setText("");
        } else if (jButton.getText() == "Submit") {
            Object result = null;
            try {
                result = scriptEngine.eval(outField.getText());
            } catch (ScriptException ex) {
                ex.printStackTrace();
            }
            outField.setText(result.toString());
        } else {
            String val = sb.append(outField.getText())
                    .append(jButton.getText())
                    .toString();
            outField.setText(val);
            sb.setLength(0);
        }
    }
}
