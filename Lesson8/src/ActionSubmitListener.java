import javax.script.ScriptException;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;

public class ActionSubmitListener implements ActionListener {
    private JTextField outField;
    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
    ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("Nashorn");

    public ActionSubmitListener(JTextField outField) {
        this.outField = outField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String v = outField.getText();
        Object result = null;
        try {
            result = scriptEngine.eval(v);
        } catch (ScriptException ex) {
            ex.printStackTrace();
        }
        outField.setText(result.toString());
    }
}
