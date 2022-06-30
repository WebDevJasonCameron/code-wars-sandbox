/**
 * 2022 03 15 ... Challenge:
 */
// Complete the method/function so that it converts dash/underscore delimited
// words into camel casing. The first word within the output should be
// capitalized only if the original word was capitalized (known as Upper Camel
// Case, also often referred to as Pascal case).
//
// Examples
//
// "the-stealth-warrior" gets converted to "theStealthWarrior"
// "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
console.log('2022 03 15 Challenge -------------------------------------')

let s1 = "the-stealth-warrior"
let s2 = "The_Stealth_Warrior"


console.log(s1)
console.log(s2)

function toCamelCase(str){
    console.log(str.replace(/-/g, ''));
    console.log(str.replace(/_/g, ''));
}

toCamelCase(s1);
toCamelCase(s2);