INSERT INTO CAR_MANUFACTURERS VALUES (1, 'BMW', 
	'Bavarian Motor Works, commonly referred to as BMW, is a German multinational company which produces luxury vehicles and motorcycles.',
	'1916', 'Munich, Germany', CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MANUFACTURERS VALUES (2, 'Mercedes-Benz', 
	'Mercedes-Benz, is a German global automobile marque and a division of Daimler AG. Mercedes-Benz is known for luxury vehicles, vans, trucks, buses, coaches and ambulances.',
	'28 June 1926', 'Stuttgart, Germany', CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MANUFACTURERS VALUES (3, 'Aston Martin', 
	'Aston Martin Lagonda Global Holdings plc is a British independent manufacturer of luxury sports cars and grand tourers.',
	'1913', 'Gaydon, England', CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MANUFACTURERS VALUES (4, 'Honda', 
	'Honda Motor Company Ltd. is a Japanese public multinational conglomerate corporation primarily known as a manufacturer of automobiles, motorcycles, and power equipment.',
	'1959', 'Minato, Tokyo', CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MANUFACTURERS VALUES (5, 'Ford Motor', 
	'Ford Motor Company, commonly known as Ford, is an American multinational automaker that has its main headquarters in Dearborn, Michigan, a suburb of Detroit.',
	'June 16, 1903', 'Michigan, USA', CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MANUFACTURERS VALUES (6, 'Volkswagen', 
	'Volkswagen, shortened to VW, is a German automaker, known for the iconic "Beetle" and headquartered in Wolfsburg. It is the flagship marque of the Volkswagen Group, the largest automaker by worldwide sales in 2016 and 2017',
	'1937', 'Wolfsburg, Germany', CURRENT_TIMESTAMP, 'user');
	
INSERT INTO CAR_BODY_TYPES VALUES (1, 'Hatchback',
	'A hatchback is a car with a hatch-type rear door that opens upwards and often a shared volume for the passenger and cargo areas.',
	CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_BODY_TYPES VALUES (2, 'Sedan',
	'A sedan, or saloon, is a passenger car in a three-box configuration with separate compartments for engine, passenger, and cargo.',
	CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_BODY_TYPES VALUES (3, 'SUV',
	'Sport utility vehicle (SUV) is a category of motor vehicles that combine elements of road-going passenger cars with features from off-road vehicles, such as raised ground clearance and four-wheel drive.',
	CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_BODY_TYPES VALUES (4, 'Sports car',
	'A sports car is designed to emphasise handling, performance or thrill of driving. Sports cars originated in Europe in the early 1900s and are currently produced by many manufacturers around the world.',
	CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_BODY_TYPES VALUES (5, 'Convertible',
	'A convertible, cabriolet or spyder/spider is a passenger car that can be driven with or without a roof in place. The methods of retracting and storing the roof vary between models.',
	CURRENT_TIMESTAMP, 'user');	
	
INSERT INTO CAR_MODELS VALUES (1, 'X1', 1,
	'The BMW X1 is a line of compact luxury SUVs produced by BMW since 2009',
	3, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (2, '3 Series', 1,
	'The BMW 3 Series is a compact executive car manufactured by the German automaker BMW since May 1975. It is the successor to the 02 Series and has been produced in seven different generations.',
	2, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (3, 'z4', 1,
	'The first generation of the BMW Z4 consists of the BMW E85 (roadster version) and BMW E86 (coupe version) sports cars. The E85/E86 generation was produced from 2002 to 2008.',
	5, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (4, '7 Series', 1,
	'The BMW 7 Series is a full-size luxury sedan produced by the German automaker BMW since 1977. It is the successor to the BMW E3 "New Six" sedan and is currently in its sixth generation.',
	2, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (5, 'E-Class', 2,
	'The Mercedes-Benz E-Class is a range of executive cars manufactured by German automaker Mercedes-Benz in various engine and body configurations.',
	2, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (6, 'S-Class', 2,
	'The Mercedes-Benz S-Class, formerly known as Sonderklasse (German for "special class", abbreviated as "S-Klasse"), is a series of full-size luxury sedans and limousines produced by the German automaker Mercedes-Benz, a division of German company Daimler AG.',
	2, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (7, 'GLA-Class', 2,
	'The Mercedes-Benz GLA-Class is a compact crossover SUV unveiled by the German manufacturer Mercedes-Benz at the 2013 Frankfurt Auto Show.',
	3, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (8, 'AMG GT', 2,
	'The Mercedes-AMG GT (C190 / R190) is a sports car produced in coupé and roadster bodystyles by German automobile manufacturer Mercedes-AMG.',
	4, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (9, 'DB11', 3,
	'The Aston Martin DB11 is a grand tourer[2] produced by British luxury car manufacturer Aston Martin since 2016. It debuted at the Geneva Motor Show in March 2016 as a replacement to the DB9.',
	4, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (10, 'Rapide', 3,
	'The Aston Martin Rapide is a 5-door, 4-seater, high-performance sports saloon, which the British luxury marque Aston Martin introduced in early 2010.',
	2, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (11, 'City', 4,
	'The Honda City is a subcompact, then a compact car which has been produced by the Japanese manufacturer Honda since 1981.',
	2, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (12, 'Jazz', 4,
	'The Honda Jazz nameplate has been used by the Japanese manufacturer Honda to denote several different motorized vehicles since 1982.',
	1, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (13, 'Jazz', 4,
	'The Honda Jazz nameplate has been used by the Japanese manufacturer Honda to denote several different motorized vehicles since 1982.',
	1, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (14, 'CR-V', 4,
	'The Honda CR-V is a compact crossover SUV manufactured by Japanese automaker Honda since 1995 and introduced in the North American market in 1997.',
	3, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (15, 'Amaze', 4,
	'The Honda Amaze is a 4-door sedan produced by Honda.',
	2, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (16, 'Mustang', 5,
	'The Ford Mustang is an American car manufactured by Ford. It was originally conceived by Lee Iacocca.',
	4, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (17, 'Endeavour', 5,
	'The Ford Everest, also known as the Ford Endeavour in the Indian market, is a Large Luxury sport utility vehicle (SUV) produced by Ford Motor Company since 2003 over three generations.',
	3, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (18, 'Figo', 5,
	'The Ford Figo, internal code name B562,[1] is a subcompact hatchback manufactured by Ford India in its Chennai and Sanand plants.',
	1, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (19, 'Aspire', 5,
	'The Ford Aspire nameplate has been used by the American automobile manufacturer Ford.',
	2, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (20, 'Polo', 6,
	'The Volkswagen Polo is a car produced by the German manufacturer Volkswagen since 1975.',
	1, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (21, 'Vento', 6,
	'Volkswagen Vento is a name used by the German company Volkswagen.',
	1, CURRENT_TIMESTAMP, 'user');
INSERT INTO CAR_MODELS VALUES (22, 'Tiguan', 6,
	'The Volkswagen Tiguan is a compact crossover vehicle (CUV) manufactured by German automaker Volkswagen.',
	3, CURRENT_TIMESTAMP, 'user');
	

