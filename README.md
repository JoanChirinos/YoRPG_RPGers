# YoRPG_RPGers
Repository for YoRPG by the RPGers-Rohan Ahammed, Joan Chirinos, and Aaron Li

# How to play!
1. Choose a difficulty by entering 1, 2, or 3. The difficulty determines the spawn rate of the monsters, not the strength
1. Enter your name!
1. Choose a class. See below for more details on classes
1. Every turn, choose an attack. You may also block, but only a limited number of times
1. Most importantly, have fun!

## Protagonist Subclasses

### **Knight**
The Knight is the most balanced class. It has slightly more health
and defense values, but slightly lower strength value. However,
this is compensated for by a higher attack rating.

##### Ability
The ability **Reckless** allows the knight to do 1.25 times the normal
damage. However, you have to let your guard down to do so much
damage, so the monster does 1.5 times the normal damage

### **Assassin**
Assassins are the weakest class in terms of health. However, they
compensate for this by having the highest attack rating of all
classes. They also have decent defense values because they are better at
dodging.

##### Ability
The ability **Hidden Attack** allows the assassin to do more damage
and potentially have a lot more defense. However, if the monster
spots you trying to hide, you don't gain as much defense

### **Tank**
Tanks have the highest health and defense values of all classes.
However, they deal relatively low damage.

##### Ability
The ability **Half Counter** allows you to deflect half of the
Monster's attack back at it. However, you don't do any additional
damage

## Monster Subclasses

### **Ninja**
Ninjas will attack you when you least expect it! They do 2.5x the
normal damage, but are more elusive than other monsters so they have more defense, but lack the ability to excel in prolonged fights due to their low HP.

### **Lich**
Liches are scary monster that use magic spells to deal a decent amount of 
damage! They deal 2.25x the normal monster damage and have defensive spells that make them harder to damage, but lack the HP for close combat.

### **Dragon**
Dragons are HUGE monsters that have 500 hp! They take a while to kill, but do an average amount of damage and have hard scales that make them hard to attack.

# Game Features

* Class selection, including infinite re-selection
* Different monster spawn-rates
* Class abilities
* Super-secret after-death healing by Geoffrey almighty
* "Hidden" duck
* 3 tiers of monster health+/attack+ drops - small, medium, and huge

# Code Restructurings
We had to restructure a lot of code to work with our vision.
For example, the yay/nay system of attacking was not compatible
with our attack system, so we scrapped it in favor of 4 different
attack choices. We also had to make a method for loot drops.
