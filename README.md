# Java Programming Exercises

## Problem: W01P10.java — Floating Point Pitfall

The formula for the area of a triangle is:

$$\text{area} = \frac{1}{2} \times \text{base} \times \text{height}$$

Write a program that reads the base and height from standard input and prints the computed area formatted to two decimal places. Beware of integer division pitfalls (e.g., `1 / 2` evaluating to `0`).

### Input
The input consists of a single line containing two space-separated floating-point numbers $b$ and $h$ ($b, h \ge 0.00$), representing the base and height in centimeters.

### Output
Output a single line in the following format:
```text
The area of the triangle is: <A> cm^2
```
where `<A>` is formatted to exactly two decimal places.

### Sample Cases

| Sample Input | Sample Output |
| :--- | :--- |
| `5.0 7.0` | `The area of the triangle is: 17.50 cm^2` |
| `10.0 4.2` | `The area of the triangle is: 21.00 cm^2` |

---

## Problem: W01P11.java — Final Velocity and Displacement

Given an object with initial velocity $u$, constant acceleration $a$, and elapsed time $t$, calculate its final velocity $v$ and total displacement $s$ using the equations of motion:

$$v = u + at$$
$$s = ut + \frac{1}{2}at^2$$

### Input
The input consists of a single line containing three space-separated floating-point numbers: initial velocity $u$, acceleration $a$, and time $t$ ($t \ge 0$).

### Output
Output two lines in the following format:
```text
The final velocity is: <V> m/s
The displacement is: <S> meters
```
where `<V>` and `<S>` are printed as standard floating-point representations.

### Sample Cases

| Sample Input | Sample Output |
| :--- | :--- |
| `12.0 3.0 5.0` | `The final velocity is: 27.0 m/s`<br>`The displacement is: 97.5 meters` |
| `0.0 9.8 2.0` | `The final velocity is: 19.6 m/s`<br>`The displacement is: 19.6 meters` |

---

## Problem: W01P12.java — Floor Tiling Cost

Calculate the total number of tiles required to cover a rectangular room including extra wastage, along with the total cost.

### Input
The input contains a single line with five space-separated floating-point numbers representing room length, room width, tile length, tile width, and cost per tile.

### Output
Output two lines in the following format:
```text
Tiles to buy: <T>
Total cost: £<C>
```
where `<T>` is the integer number of tiles to purchase and `<C>` is formatted to two decimal places.

### Sample Cases

| Sample Input | Sample Output |
| :--- | :--- |
| `12.5 8.0 0.5 0.08 3.20` | `Tiles to buy: 432`<br>`Total cost: £1382.40` |
| `10.0 10.0 1.0 0.10 5.50` | `Tiles to buy: 110`<br>`Total cost: £605.00` |

---

## Problem: W01P13.java — Two-Stage Journey

A delivery van travels in two legs. First it covers distance $d_1$ km at steady speed $s_1$ km/h, then takes a rest stop of $r_1$ minutes. Next it covers distance $d_2$ km at steady speed $s_2$ km/h, followed by a fuel stop of $r_2$ minutes. Calculate the total elapsed travel time (in whole hours and remaining minutes) and the overall average speed for the entire trip.

### Input
The input contains a single line with six space-separated numbers:
```text
d1 s1 r1 d2 s2 r2
```
where distances ($d_1, d_2$) and speeds ($s_1, s_2$) are positive floating-point numbers, and $r_1, r_2$ are non-negative integers representing stop times in minutes.

### Output
Output two lines in the following format:
```text
Total travel time: <H> hours <M> minutes
Overall average speed: <S> km/h
```
where `<S>` is formatted to two decimal places.

### Sample Cases

| Sample Input | Sample Output |
| :--- | :--- |
| `120.0 80.0 10 200.0 100.0 15` | `Total travel time: 3 hours 55 minutes`<br>`Overall average speed: 81.70 km/h` |
| `60.0 60.0 0 60.0 60.0 0` | `Total travel time: 2 hours 0 minutes`<br>`Overall average speed: 60.00 km/h` |

---

## Problem: W01P14.java — UCAS Tariff Points

In the UK, university admissions convert A Level grades into UCAS Tariff points:
* **Grade A** is worth **48 points**
* **Grade B** is worth **40 points**
* **Grade C** is worth **32 points**

Write a program that reads three space-separated non-negative integers representing the number of A grades ($a$), B grades ($b$), and C grades ($c$) from standard input, and calculates and prints the total UCAS Tariff points.

### Input
The input consists of a single line containing three space-separated non-negative integers:
```text
a b c
```
where $a, b, c \ge 0$ represent the counts of grades A, B, and C respectively.

### Output
Output a single line in the following format:
```text
Total UCAS points: <P>
```
where `<P>` is the integer sum calculated as:

$$\text{Points} = a \times 48 + b \times 40 + c \times 32$$

### Sample Cases

| Sample Input | Sample Output |
| :--- | :--- |
| `2 1 0` | `Total UCAS points: 136` |
| `0 2 1` | `Total UCAS points: 112` |