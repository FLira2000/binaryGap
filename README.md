# binaryGap
This code here transforms a number in it's binary representation, and counts it's binary gap.

>A binary gap is the 'space' of zeros between the one bits in a bit word.

Actually, this calculation is pretty uncommon those days, but was a challenge for a internship.

***Why this was projected***

Because data transmissions are now digital and much more smarten than before, we don't have this worry anymore. But, if we think about synchronized transmissions of bits, sometimes a word of bits could have a zero burst inside, larger than the usual, what could be too interpreted as a disconnection or a signal lost. If you know the maximum zero gap that exists in a bit word, you can send to the receiver, and the receiver can set it's window based on this.

Imagine a simple number being converted to binary - let's take 9 to begin. It binary representation is 1001. The gap between the one bits is formed by 2 zeros, which is the binary gap of the number 9. The same logic is used to another numbers, to get the biggest binary gap. 

The number 129 converted is '1000 0001'. You can assume this is a big gap. Now imagine a transmission that sends in a speed of one bit per second, and you are watching the receiver. Suddenly, it goes six seconds without receiving anything. If the window is of a four seconds time out, the transmission would be terminated because the number 129 has a binary gap bigger than the target's timeout. That's the point of this calculation.

Thanks for coming here and reading this. 
This is free to contribute, and use.
