---
created: Wednesday 13th September 2023 16:17
Last modified: Wednesday 13th September 2023 16:16
Aliases: turing
Tags: programming
---

# [[Machine Turing]]

# Turing Machine and Programmability

[You can find the lecture video here.](https://youtu.be/cmfDBAiogA0) You can also **click** on each header to bring you to the section of the video covering the subtopic.

## [](https://natalieagus.github.io/50002/notes/turingmachine#overview)[Overview](https://www.youtube.com/watch?v=cmfDBAiogA0&t=0s)

A Finite State Machine does not keep track of the number of states it _visited_, it is only aware of the current state _it is in_. Therefore it is unable to solve problems like detecting palindrome or checking balanced parenthesis. There is no way to tell whether you have visited a state for the first time, or for the nth

time.

The Turing Machine is a **mathematical** model of computation that defines an abstract **machine**. It is a machine that is able to implement **any** functionalities that FSM can implement, and it doesn’t face this limitation that FSM has.

## [](https://natalieagus.github.io/50002/notes/turingmachine#basics-of-turing-machine)[Basics of Turing Machine](https://www.youtube.com/watch?v=cmfDBAiogA0&t=111s)

![](https://natalieagus.github.io/50002/assets/contentimage/others/slice1.png)

Dino-themed TM, courtesy of Beverley, a 50002 (2022) student.

A Turing Machine is often represented as an “arrow” and a series of input written on a “tape”, as drawn in the figure below:

![](https://dropbox.com/s/n41r5z8o2p5dpea/tmeg.png?raw=1)

### [](https://natalieagus.github.io/50002/notes/turingmachine#how-it-works)How it Works

The idea is to **imagine** that we have a physical machine (like a typewriter machine or something), called the Turing Machine, which can read a sequence of inputs written on an _infinitely long_ “_tape_” (its basically an array).

We can write onto the currently pointed location of the tape (and also read from it). Like an FSM, the Turing Machine also has a **specification**, illustrated by the truth table above. Building a Turing Machine with specification K

allows it to behave based on K

when fed any array of inputs.

The **pointer** of the machine (black arrow) represents our current input read on the tape. To operate the machine, we can _move the tape_ left and right to shift the arrow, or you can _move the arrow_ left and right. They are the same.

Note that in order to move the arrow to the **right**, we need to equivalently move the tape to the **left**. **In practice**, we move the tape, not the arrow.

There exists a **HALT** state where you reach the end-state, and of course a **START** state as well.

