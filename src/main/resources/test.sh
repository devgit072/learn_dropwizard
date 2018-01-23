#!/bin/bash
str1="dev"
str2="drev"
str3="dev"
if [$str1 != $str2]; then
echo "str1 and str2 are not equal"
elif [$str2 == $str3]; then
echo "str2 and str3 are equal"
fi