'use strict';

$(document).ready(function(){

    $('#btn_solve').click(function(){
        $('#list').empty();
        var x = $('#in_num').val();

        for(var i=1; i<=x; i++){
            if(!(checkPrime(i))) continue;
            if(!(checkPalindrome(i))) continue;
            $('#list').append("<li>" + i + "</li>");
        }
    });

    function checkPrime(num){
        var half = num/2;
        for(var i=2; i<=half; i++){
            if(num%i == 0){
                return false;
            }
        }

        return true;
    }

    function checkPalindrome(num){
        var s = num.toString();
        for(var i=0, j=s.length-1; i<s.length/2; i++, j--){
            if(s[i] != s[j]){
                return false;
            }
        }

        return true;
    }
});
