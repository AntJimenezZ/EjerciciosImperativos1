%Ejercicio1

sumlist([], 0).
sumlist([X | Resto], S) :-
    sumlist(Resto, SResto),  S is X + SResto.



%Ejercicio2

subconj(S1, S2) :- subset(S1, S2).
subset([], _).
subset([X|XC], T) :- member(X, T), subset(XC, T).



%Ejercicio3

aplanar([], []).
aplanar([H | T], L2) :-
    aplanar(H, L1),
    aplanar(T, Resto),
    append(L1, Resto, L2).
aplanar(X, [X]).



%Ejercicio4

partir([], _, [], []).
partir([X | Resto], Umbral, [X | Menores], Mayores) :-
    X < Umbral,
    partir(Resto, Umbral, Menores, Mayores).

partir([X | Resto], Umbral, Menores, [X | Mayores]) :-
    X >= Umbral,
    partir(Resto, Umbral, Menores, Mayores).



%Ejercicio5

contiene_subcadena(Cadena, Subcadena) :-
    sub_string(Cadena, _, _, _, Subcadena).

sub_cadenas(Subcadena, ListaCadenas, Filtradas) :-
    findall(Cadena, (member(Cadena, ListaCadenas), contiene_subcadena(Cadena, Subcadena)), Filtradas).
