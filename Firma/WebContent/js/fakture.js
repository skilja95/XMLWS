var obradiFakturuURL = "main/obradiFakturu";


$(document).on('submit', '.fakturaForm', function(e) {
	e.preventDefault();
	var idPoruke = $(this).find("input[name=idPoruke]").val();
	var brojRacuna = $(this).find("input[name=brojRacuna]").val();
	var datumRacuna = $(this).find("input[name=datumRacuna]").val();
	var vrednostRobe = $(this).find("input[name=vrednostRobe]").val();
	var vrednostUsluga = $(this).find("input[name=vrednostUsluga]").val();
	var ukupnoRobaIUsluge = $(this).find("input[name=ukupnoRobaIUsluge]").val();
	var ukupanRabat = $(this).find("input[name=ukupanRabat]").val();
	var ukupanPorez = $(this).find("input[name=ukupanPorez]").val();
	var oznakaValute = $(this).find("input[name=oznakaValute]").val();
	var iznosZaUplatu = $(this).find("input[name=iznosZaUplatu]").val();
	var uplataNaRacun = $(this).find("input[name=uplataNaRacun]").val();
	var datumValute = $(this).find("input[name=datumValute]").val();
	var kupacNaziv = $(this).find("input[name=kupacNaziv]").val();
	var kupacAdresa = $(this).find("input[name=kupacAdresa]").val();
	var kupacPib = $(this).find("input[name=kupacPib]").val();
	var dobavljacNaziv = $(this).find("input[name=dobavljacNaziv]").val();
	var dobavljacAdresa = $(this).find("input[name=dobavljacAdresa]").val();
	var dobavljacPib = $(this).find("input[name=dobavljacPib]").val();
	
	
	var redniBroj = $(this).find("input[name=redniBroj]").val();
	var nazivRobeIliUsluge = $(this).find("input[name=nazivRobeIliUsluge]").val();
	var kolicina = $(this).find("input[name=kolicina]").val();
	var jedinicaMere = $(this).find("input[name=jedinicaMere]").val();
	var jedinicnaCena = $(this).find("input[name=jedinicnaCena]").val();
	var vrednost = $(this).find("input[name=vrednost]").val();
	var procenatRabata = $(this).find("input[name=procenatRabata]").val();
	var iznosRabata = $(this).find("input[name=iznosRabata]").val();
	var umanjenoZaRabat = $(this).find("input[name=umanjenoZaRabat]").val();
	var ukupanPorez1 = $(this).find("input[name=ukupanPorez1]").val();

//	console.log(idPoruke + " ");
//	console.log(brojRacuna + " ");
//	console.log(datumRacuna + " ");
//	console.log(vrednostRobe + " ");
//	console.log(vrednostUsluga + " ");
//	console.log(ukupnoRobaIUsluge + " ");
//	console.log(ukupanRabat + " ");
//	console.log(ukupanPorez + " ");
//	console.log(oznakaValute + " ");
//	console.log(iznosZaUplatu + " ");
//	console.log(uplataNaRacun + " ");
//	console.log(datumValute + " ");
//	console.log(kupacNaziv + " ");
//	console.log(kupacAdresa + " ");
//	console.log(kupacPib + " ");
//	console.log(dobavljacNaziv + " ");
//	console.log(dobavljacAdresa + " ");
//	console.log(dobavljacPib + " ");
//	
//	
//	console.log(redniBroj + " ");
//	console.log(nazivRobeIliUsluge + " ");
//	console.log(kolicina + " ");
//	console.log(jedinicaMere + " ");
//	console.log(jedinicnaCena + " ");
//	console.log(vrednost + " ");
//	console.log(procenatRabata + " ");
//	console.log(iznosRabata + " ");
//	console.log(umanjenoZaRabat + " ");
//	console.log(ukupanPorez1 + " ");
	
	$.ajax({
		type : 'POST',
		url : obradiFakturuURL,
		contentType : 'application/xml',
		dataType : "text",
		data : formToXMLSearch(idPoruke,brojRacuna, datumRacuna, vrednostRobe, vrednostUsluga, ukupnoRobaIUsluge,ukupanRabat,
				ukupanPorez, oznakaValute,iznosZaUplatu, uplataNaRacun,datumValute, kupacNaziv, kupacAdresa,kupacPib,
				dobavljacNaziv,dobavljacAdresa,dobavljacPib, redniBroj,nazivRobeIliUsluge , kolicina, jedinicaMere,jedinicnaCena,
				vrednost, procenatRabata, iznosRabata, umanjenoZaRabat, ukupanPorez1),
		success : function(data) {
			if (data == "OK") {

				toastr.options = {
					"closeButton" : true,
					"debug" : false,
					"newestOnTop" : false,
					"progressBar" : false,
					"positionClass" : "toast-top-right",
					"preventDuplicates" : false,
					"onclick" : null,
					"showDuration" : "300",
					"hideDuration" : "1000",
					"timeOut" : "5000",
					"extendedTimeOut" : "1000",
					"showEasing" : "swing",
					"hideEasing" : "linear",
					"showMethod" : "fadeIn",
					"hideMethod" : "fadeOut"
				}
				toastr.info('File sent to firm.');
				 
			}
			if (data == "ERROR") {

				toastr.options = {
					"closeButton" : true,
					"debug" : false,
					"newestOnTop" : false,
					"progressBar" : false,
					"positionClass" : "toast-top-right",
					"preventDuplicates" : false,
					"onclick" : null,
					"showDuration" : "300",
					"hideDuration" : "1000",
					"timeOut" : "5000",
					"extendedTimeOut" : "1000",
					"showEasing" : "swing",
					"hideEasing" : "linear",
					"showMethod" : "fadeIn",
					"hideMethod" : "fadeOut"
				}
				toastr.info('Error in creating file. Check file fields!');
				 
			}
		},
		error : function(XMLHttpRequest, textStatus, errorThrown) {
			alert("AJAX ERROR: " + errorThrown);
		}
	});
	
});


//console.log(idPoruke + " ");
//console.log(brojRacuna + " ");
//console.log(datumRacuna + " ");
//console.log(vrednostRobe + " ");
//console.log(vrednostUsluga + " ");
//console.log(ukupnoRobaIUsluge + " ");
//console.log(ukupanRabat + " ");
//console.log(ukupanPorez + " ");
//console.log(oznakaValute + " ");
//console.log(iznosZaUplatu + " ");
//console.log(uplataNaRacun + " ");
//console.log(datumValute + " ");
//console.log(kupacNaziv + " ");
//console.log(kupacAdresa + " ");
//console.log(kupacPib + " ");
//console.log(dobavljacNaziv + " ");
//console.log(dobavljacAdresa + " ");
//console.log(dobavljacPib + " ");
//
//
//console.log(redniBroj + " ");
//console.log(nazivRobeIliUsluge + " ");
//console.log(kolicina + " ");
//console.log(jedinicaMere + " ");
//console.log(jedinicnaCena + " ");
//console.log(vrednost + " ");
//console.log(procenatRabata + " ");
//console.log(iznosRabata + " ");
//console.log(umanjenoZaRabat + " ");
//console.log(ukupanPorez1 + " ");

function formToXMLSearch(idPoruke,brojRacuna, datumRacuna, vrednostRobe, vrednostUsluga, ukupnoRobaIUsluge,ukupanRabat,
		ukupanPorez, oznakaValute,iznosZaUplatu, uplataNaRacun,datumValute, kupacNaziv, kupacAdresa,kupacPib,
		dobavljacNaziv,dobavljacAdresa,dobavljacPib, redniBroj,nazivRobeIliUsluge , kolicina, jedinicaMere,jedinicnaCena,
		vrednost, procenatRabata, iznosRabata, umanjenoZaRabat, ukupanPorez1) {
	var vrati = "<faktura xmlns=\"http://www.ftn.uns.ac.rs/faktura\" "+
    "xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" "+
    "xsi:schemaLocation=\"http://www.ftn.uns.ac.rs/faktura file:/C:/Users/skilj/Documents/GitHub/XMLWS/Firma/schemas/Faktura.xsd\">" +
				    "<zaglavlje_fakture>" +
				        "<id_poruke>"+idPoruke+"</id_poruke>" +
				       "<broj_racuna>"+brojRacuna+"</broj_racuna>" +
				       "<datum_racuna>"+datumRacuna+"</datum_racuna>" +
				     "<vrednost_robe>"+vrednostRobe+"</vrednost_robe>" +
				      "<vrednost_usluga>"+vrednostUsluga+"</vrednost_usluga>" +
				     "<ukupno_roba_i_usluge>"+ukupnoRobaIUsluge+"</ukupno_roba_i_usluge>" +
				     "<ukupan_rabat>"+ukupanRabat+"</ukupan_rabat>" +
				     "<ukupan_porez>"+ukupanPorez+"</ukupan_porez>" +
				     "<oznaka_valute>"+oznakaValute+"</oznaka_valute>" +
				    "<iznos_za_uplatu>"+iznosZaUplatu+"</iznos_za_uplatu>" +
				    "<uplata_na_racun>"+uplataNaRacun+"</uplata_na_racun>" +
				    "<datum_valute>"+datumValute+"</datum_valute>" +
				     "<kupac>" +
				     "<naziv>"+kupacNaziv+"</naziv>" +
				     "<adresa>"+kupacAdresa+"</adresa>" +
				     "<pib>"+kupacPib+"</pib>" +
				     "</kupac>" +
				     "<dobavljac>" +
				    "<naziv>"+dobavljacNaziv+"</naziv>" +
				    "<adresa>"+dobavljacAdresa+"</adresa>" +
				   "<pib>"+dobavljacPib+"</pib>" +
				   "</dobavljac>" +
				 "</zaglavlje_fakture>" +
				 "<stavka_fakture>" +
				 "<redni_broj>"+redniBroj+"</redni_broj>" +
				 "<naziv_robe_ili_usluge>"+nazivRobeIliUsluge+"</naziv_robe_ili_usluge>" +
				   "<kolicina>"+kolicina+"</kolicina>" +
				   "<jedinica_mere>"+jedinicaMere+"</jedinica_mere>" +
				    "<jedinicna_cena>"+jedinicnaCena+"</jedinicna_cena>" +
				   "<vrednost>"+vrednost+"</vrednost>" +
				   "<procenat_rabata>"+procenatRabata+"</procenat_rabata>" +
				   "<iznos_rabata>"+iznosRabata+"</iznos_rabata>" +
				    "<umanjeno_za_rabat>"+umanjenoZaRabat+"</umanjeno_za_rabat>" +
				  "<ukupan_porez>"+ukupanPorez1+"</ukupan_porez>" +
				"</stavka_fakture>" +
			"</faktura>";
	console.log(vrati)
	return vrati;
}