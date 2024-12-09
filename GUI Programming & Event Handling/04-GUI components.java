/*
 Let’s break down each **GUI component** one by one in an **easy-to-understand way** with short definitions, features, and examples.

---

### **1. Buttons**:
- **Definition**: A button is a clickable component used to perform an action when clicked.
- **Usage**: Typically used for user interactions like submitting forms or triggering events.

#### Example:
```java
import javax.swing.*;

public class ButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button Example");
        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 100, 40);

        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

---

### **2. Check Boxes**:
- **Definition**: Checkboxes allow the user to select multiple options from a set of choices.
- **Usage**: Used for independent multiple selections.

#### Example:
```java
import javax.swing.*;

public class CheckBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CheckBox Example");
        JCheckBox cb1 = new JCheckBox("Option 1");
        JCheckBox cb2 = new JCheckBox("Option 2");
        cb1.setBounds(50, 50, 100, 30);
        cb2.setBounds(50, 100, 100, 30);

        frame.add(cb1);
        frame.add(cb2);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
```

---

### **3. Radio Buttons**:
- **Definition**: Radio buttons allow the user to select **only one option** from a group.
- **Usage**: Used for mutually exclusive choices (e.g., gender selection).

#### Example:
```java
import javax.swing.*;

public class RadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Radio Button Example");
        JRadioButton rb1 = new JRadioButton("Male");
        JRadioButton rb2 = new JRadioButton("Female");
        rb1.setBounds(50, 50, 100, 30);
        rb2.setBounds(50, 100, 100, 30);

        ButtonGroup bg = new ButtonGroup(); // To group radio buttons
        bg.add(rb1);
        bg.add(rb2);

        frame.add(rb1);
        frame.add(rb2);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
```

---

### **4. Labels**:
- **Definition**: Labels are non-editable text components used to display information.
- **Usage**: Typically used to describe input fields or display messages.

#### Example:
```java
import javax.swing.*;

public class LabelExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Label Example");
        JLabel label = new JLabel("Hello, World!");
        label.setBounds(50, 50, 200, 30);

        frame.add(label);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
```

---

### **5. Text Fields**:
- **Definition**: A text field is a single-line input area where users can type text.
- **Usage**: Used for inputs like names, emails, etc.

#### Example:
```java
import javax.swing.*;

public class TextFieldExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Field Example");
        JTextField tf = new JTextField();
        tf.setBounds(50, 50, 200, 30);

        frame.add(tf);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
```

---

### **6. Text Areas**:
- **Definition**: A text area is a multi-line editable component for typing large amounts of text.
- **Usage**: Used for inputs like comments or descriptions.

#### Example:
```java
import javax.swing.*;

public class TextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Text Area Example");
        JTextArea ta = new JTextArea();
        ta.setBounds(50, 50, 200, 100);

        frame.add(ta);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
```

---

### **7. Combo Boxes**:
- **Definition**: A combo box is a dropdown list of selectable options.
- **Usage**: Used for selecting one option from a list.

#### Example:
```java
import javax.swing.*;

public class ComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Combo Box Example");
        String[] options = {"Option 1", "Option 2", "Option 3"};
        JComboBox<String> cb = new JComboBox<>(options);
        cb.setBounds(50, 50, 150, 30);

        frame.add(cb);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
```

---

### **8. Lists**:
- **Definition**: A list displays multiple items, allowing the user to select one or more.
- **Usage**: Useful for displaying multiple options in a scrollable format.

#### Example:
```java
import javax.swing.*;

public class ListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("List Example");
        String[] items = {"Item 1", "Item 2", "Item 3", "Item 4"};
        JList<String> list = new JList<>(items);
        list.setBounds(50, 50, 100, 100);

        frame.add(list);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
```

---

### **9. Scroll Bars**:
- **Definition**: Scroll bars allow users to navigate through content that exceeds the visible area.
- **Usage**: Commonly used in conjunction with text areas or lists.

---

### **10. Sliders**:
- **Definition**: A slider lets users select a value by sliding a knob within a range.
- **Usage**: For selecting numerical values like volume or brightness.

---

### **11. Windows**:
- **Definition**: Windows are top-level containers like `JFrame` that hold GUI components.

---

### **12. Menus**:
- **Definition**: Menus are components that provide dropdown lists for actions (like File, Edit in apps).
- **Usage**: Created using `JMenu`, `JMenuItem`.

---

### **13. Dialog Box**:
- **Definition**: Dialogs are pop-up windows for alerts, inputs, or custom messages.
- **Usage**: Use `JOptionPane` for quick dialogs.

---

 */