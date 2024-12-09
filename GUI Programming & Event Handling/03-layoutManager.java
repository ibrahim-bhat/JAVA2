
/* 
### **Layout Managers in Java**
In Java, layout managers are used to arrange components (like buttons, text fields, etc.) in a container (like a panel or frame). They determine the size and position of components automatically, making the user interface flexible and responsive.

---

### **1. Flow Layout**
#### **Definition**:
Flow Layout arranges components in a row, one after another, and moves to the next line if there’s not enough space. It is the default layout manager for panels in Java.

#### **Key Features**:
- Components are arranged **horizontally** and wrap to the next line when the container width is exceeded.
- The alignment of components can be set (LEFT, CENTER, or RIGHT).
- It is **simple and easy** to use for basic layouts.

#### **Code Example**:


import java.awt.*;
import javax.swing.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Flow Layout Example");
        frame.setLayout(new FlowLayout(FlowLayout.CENTER)); // Set FlowLayout
        frame.setSize(400, 200);
        
        // Add buttons
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

#### **Output**:
- Buttons are arranged in a row, and if the frame is resized, the layout adjusts automatically.

---

### **2. Border Layout**
#### **Definition**:
Border Layout divides the container into five regions:
- **NORTH** (top)
- **SOUTH** (bottom)
- **EAST** (right)
- **WEST** (left)
- **CENTER** (middle)

Each region can hold **one component**, and the center region takes up the remaining space.

#### **Key Features**:
- Useful for dividing the screen into logical sections.
- Allows the developer to place components in specific areas of the frame.

#### **Code Example**:
```java
import java.awt.*;
import javax.swing.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Border Layout Example");
        frame.setLayout(new BorderLayout()); // Set BorderLayout
        frame.setSize(400, 200);

        // Add buttons to different regions
        frame.add(new JButton("NORTH"), BorderLayout.NORTH);
        frame.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        frame.add(new JButton("EAST"), BorderLayout.EAST);
        frame.add(new JButton("WEST"), BorderLayout.WEST);
        frame.add(new JButton("CENTER"), BorderLayout.CENTER);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

#### **Output**:
- Buttons are placed in their respective regions. The center region expands to fill the leftover space.

Alright! Let’s include **Grid Layout** with the previous layout managers.

---

### **3. Grid Layout**
#### **Definition**:
Grid Layout arranges components in a rectangular grid of rows and columns. Each cell in the grid is of equal size, and components are placed one by one in the cells from left to right, top to bottom.

#### **Key Features**:
- Divides the container into equal-sized cells.
- You can specify the number of rows and columns in the grid.
- Each component takes up exactly one cell.

#### **Code Example**:
```java
import java.awt.*;
import javax.swing.*;

public class GridLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Grid Layout Example");
        frame.setLayout(new GridLayout(2, 3)); // 2 rows and 3 columns
        frame.setSize(400, 200);

        // Add buttons
        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));
        frame.add(new JButton("Button 4"));
        frame.add(new JButton("Button 5"));
        frame.add(new JButton("Button 6"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
```

#### **Output**:
- The window has 2 rows and 3 columns. Buttons are arranged in these cells, all equally sized.

---

### **Comparison of Layout Managers**:

| Feature              | Flow Layout                          | Border Layout                      | Grid Layout                      |
|----------------------|--------------------------------------|------------------------------------|----------------------------------|
| **Arrangement**      | Components in a row; wraps to the next line | Components in 5 predefined regions | Components in a grid             |
| **Flexibility**      | Simple and flexible                 | Fixed sections (NORTH, SOUTH, etc.) | Equal-sized grid cells           |
| **Use Case**         | For small, dynamic UIs              | Section-based designs              | Tabular layouts                  |

---




*/