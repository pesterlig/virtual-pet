This is the README for virtual-pet

Pet will be a cat

Pet will have a game loop, a clock, 
and methods for eating, pooping, etc.

Decided to recreate code - didn't like having a negative scale (hunger increase is a negative thing)
thought a long time (too long) about needs and how to meet them, 
also discovered that the English language is not built for this kind of thinking - we need new words to 
express fullBellyness - Satiation is not pleasing 

fullOFood
comes from Feed Pet, Water Pet (or perhaps, regular food & treats - water is kind of boring)
fit
comes from Let pet out,  Play with pet (unlock cat door, drag a string around the room, catnip mouse)
beloved
comes from snuggle pet, (speak in pet's language - miaow at cat, snuggle pet, cathug,
rested (ignore pet, take a nap with pet -everyone needs downtime) - true - but boring - and too many things
All add up to contentment - when your pet is discontent, it runs away (no getting hit by cars..)
 
 Ideas
how you interact with your pet is multiplied by a random number -  food = increases fullOFood by 10*random(1-5)
your pet doesn't always react the same way - eat all the food, etc.

your pet comes to you with random stats

 (Random from my son: "Do you ever think its weird how there's a giant thing in the sky that we're not allowed to look at?")
 
(Same son later: "I wonder how chairs would be different if we had tails.")

*****
Worked on VirtualPet - cat -
Game loop is working now
random feeding etc. is working
not sure if I like the way doubles appear on the print line - do I need them?
need to put a limit of 100% on fullOFood etc.
need to build methods for each choice - feed, hug, play
need to build tick method
want to build some random descriptions for cat 1=tabby, 2=calico 3=tuxedo etc.

*****
gave up on the negative thing - I am really hung up on the language of this one
hunger, health, happiness - simple & alliterative
made a feedSalmon method, made limit on 100% full, got rid of doubles for everything but contentment

*****
made more methods - still a little buggy, but must take break

****
methods working a little better, but game loop is not working....  grrrr
going to comment out all the methods but one and see if I can get the game to end
*****
tweaked some things and the game works now - time for refactoring and stretch goals


