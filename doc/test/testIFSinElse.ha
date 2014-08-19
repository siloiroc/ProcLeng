-- if sin else, operadores relacionales >  = logico or


procedure testCase05 () is

    t: Boolean;
	a,b: Integer;
	x,y,z: Integer;

begin

	t := true;
	a := 1;
	b := 1;
	x := 10;
	y := 5;
	z := 1;

    if (a>b or (x>y or x>z)) then
    	Put_line("cierto");
    end if;

end testCase05;