procedure ejemplo_con_todo () is
-- Este es un comentario correcto
-- Este comentario
-- ocupa varias
-- líneas
--- - Este es un comentario erroneo


-- constantes simbólicas
CIERTO: constant := True;
FALSO: constant := False;
UNO: constant := 1;
--TRES:constant := 2+1; -- ERROR, valor no puede ser una expresion
--DOS: constant := +2; -- ERROR, el entero no ha de llevar signo
--CINCO: constant : =5 -- ERROR, falta punto y coma

-- tipos globales
type Tpersona is record
	dni: Integer;
	edad : Integer;
	casado : Boolean;
end record;

type Tfecha is record
	dia: Integer;
	mes : Integer;
	anyo : Integer;
end record;

type Tcita is record
	usuario:Tpersona;
	fecha:Tfecha;
end record;



-- variables globales
x:Integer;
mayorEdad:Boolean;
p1: Tpersona;
f1:Tfecha;
c1:Tcita;

x,y : Integer;
a : Boolean;
p1,p2: Tpersona;
ve1 : Vector1;
--a: Integer := 1; -- error. Asignacion no permitida

-- subprogramas
function mayorDeEdad (edad: Integer) return Boolean is
begin
	if edad>MAYORDEEDAD then
		return True;
	else
	return False;
	end if;
end mayorDeEdad;

procedure imprimePersona(dni:Integer; edad:Integer)is

	-- variable local
	debug: Boolean;

	-- procedimiento anidado
	procedure escribe (x: Integer) is
	begin
		Put_line(x);
	end escribe;

begin -- de imprimePersona
	escribe(dni);
	debug:=True;
end imprimePersona;

function uno() return Integer is
	begin
	return 1;
end uno;

function suma (x, y: Integer) return Integer is
	z: Integer;
begin
	z:= x+y;
	return z;
end suma;

function mayor (x, y: Integer) return Boolean is
begin
	return x>y;
end mayor;	

-- Ejemplo declaración de subprogramas anidados
function padre (x:Integer; y:Integer) return Integer is
	z: Integer;
	procedure hijo (a: Integer) is
	begin
		Put_line (a); -- Muestra el valor de a
	end hijo;
begin
	z:= x+y;
	hijo (z);
	return z;
end padre;

-- ERROR: function dos faltan los paréntesis ()
--function dos return Integer is
--begin
--	return 2;
--end dos;

-- ERROR: function tres debe devolver un tipo primitivo
function tres() return Tpersona is
begin
	return p1;
end tres;

-- ERROR: function cuatro falta sentencia return
--function cuatro(a:Integer; b:Integer) return Integer is
--	y:Boolean
--begin
--	y:= a and b;
--end cuatro;

procedure vacio()is
begin
end vacio;

procedure suma (x, y, z: Integer) is
-- parametros pasados por valor
begin
	z:= x+y;
end suma;

-- ERROR. Procedure devuelve. No puede tener return
procedure devuelve () is
begin
	return 1;
end devuelve;

-- procedimiento principal
begin
	x:=x+2; -- Comentario despues de una sentencia
	persona1.dni:=1234;
	persona1.edad:=23;
	if mayorDeEdad(persona1.edad)then
		Put_line("Persona:");
		--imprimePersona(persona.dni, edad);
	end if;
	

p1.dni := 1234;
p1.edad := 23;
f1.dia := 12;
f1.mes := 3;
c1.usuario := p1;
c1.fecha :=f1;
c1.fecha.anyo := 2012;
x := c1.usuario.edad;
mayorEdad := c1.usuario.edad > 18;
-- En este último ejemplo se compara un campo de un registro.
-- Esto es correcto. Lo que no es posible es comparar registros


x := resta(a, b);
y := suma(a, resta(b, c));
a := funcion1();
b := suma (r.campo1, r.campo2); -- r es de tipo registro

--funcion2(z) := 3; -- ERROR.
	
end ejemplo;