
---
created: Friday 3rd March 2023 19:02
Last modified: Friday 3rd March 2023 19:01
Aliases: matplotlib
Tags: python
---

# [[python_Matplotlib|Matplotlib]]

parent: [[MOC-Machine Learning]]
📌Библиотека для построения графиков и гистограмм

Основные элементы **plot**:
- **Figure** - это *холст* 
- **Axes** - это то, что мы рисуем на холсте
- ![[Pasted image 20230303195314.png]]

## Matplotlib workflow

```python
# 0. import matplotlib and get it ready for plotting in Jupyter
import matplotlib.pyplot as plt
# 1. Prepare data
x = [1,2,3,4,5]
y = [100,200,300,400,500]
# 2. Setup plot
fig, (ax, ax2) = plt.subplots(1,2)
# 3. Plot data
ax.plot(x,y)
# 4. Customize plot
ax.set(title="Plot 1",
        xlabel="x-axis",
       ylabel="y-axis")
ax2.set(title="Plot 2",
        xlabel="x-axis",
       ylabel="y-axis")

# 5. Save & show (you save the whole figure)
fig.savefig("images/plot_example.png")
```



![[Pasted image 20230303190948.png|500]]

