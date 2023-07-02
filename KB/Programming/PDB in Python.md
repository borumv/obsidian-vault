---
created: Sunday 2nd July 2023 09:52
Last modified: Sunday 2nd July 2023 09:52
Aliases: pdb
Tags: programming
---

## **PDB** in [[📙Python]]
Это улчшенный дебагер, позволяющий с помощью консольных команд, понять, что происх
одит в методе во время его выполнения.
```python
import pdb  
  
  
def sum(num1, num2):  
    pdb.set_trace()  
    return num1 + num2  
  
  
sum(4, "432df")
```