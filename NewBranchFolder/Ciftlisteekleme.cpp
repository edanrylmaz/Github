/*�ift y�nl� do�rusal ba�l� liste ve fonksiyonlar�*/
#include<conio.h>
#include<stdio.h>
#include<stdlib.h>
#include <iostream>
/*ELEMAN YAPISI TANIMI*/
typedef struct cifteleman{
int icerik ;
struct cifteleman *ileri ;
struct cifteleman *geri ;
} Cifteleman;
typedef Cifteleman *Ciftelemanptr ;
/*C�FT BA�LI L�STE YAPISI TANIMI*/
typedef struct ciftliste {
Ciftelemanptr bas;
Ciftelemanptr son;
} Ciftliste ;
typedef Ciftliste * Ciftlisteptr ;
//YEN� ELEMAN OLUSTURMA FONKS�YONU
Ciftelemanptr yeni_cifteleman( int icerik ){
Ciftelemanptr eleman;
eleman = (Ciftelemanptr)malloc(sizeof(Cifteleman ));
eleman->icerik = icerik;
eleman->ileri = NULL;
eleman->geri = NULL;
return eleman;
}
//YEN� ��FT BA�LI L�STE OLUSTURMA FONKS�YONU
Ciftlisteptr yeni_ciftliste (){
Ciftlisteptr liste ;
liste =(Ciftlisteptr) malloc( sizeof ( Ciftliste ));
liste ->bas = NULL;
liste ->son = NULL;
}
//ba�a ekleme fonksiyonu...O(1)
void liste_basina_ekle ( Ciftlisteptr l , Ciftelemanptr yeni){
 if ( l->son == NULL)
 l->son = yeni;
 else
 l->bas->geri = yeni;
 yeni->ileri = l->bas;
 l->bas = yeni;
 }
 //sonuna ekleme fonksiyonu...O(1)
 void listeye_ekle ( Ciftlisteptr l , Ciftelemanptr yeni){
 if ( l->bas == NULL)
 l->bas = yeni;
 else
 l->son->ileri = yeni;
 yeni->geri = l->son;
 l->son = yeni;
 }
 //ortaya ekleme fonksiyonu...O(1)
 void liste_orta_ekle (Ciftelemanptr yeni , Ciftelemanptr once){
 	//once son eleman ise hata veriyor...
 	//Bu hatay� Ciftliteekleme_2.cpp program�nda d�zeltiyoruz...
 yeni->ileri = once->ileri;
 yeni->geri = once;
 once->ileri->geri = yeni;
 once->ileri = yeni;
 }
void listeyi_yaz(Ciftlisteptr liste){
Ciftelemanptr tmp;
 /*YAZDIRMA L�STE BA�INDAN L�STEN�N SONUNA KADAR ...O(N)--N:ELEMAN/D���M SAYISI*/
 tmp = liste->bas;
 while (tmp!=NULL){
 printf("\nListedeki sayi:%d",tmp->icerik);
 tmp = tmp->ileri;
 }
 printf("\n devam icin bir tusa basiniz...");
 getch();
}
 /*��FT BA�LI L�STEDE ELEMAN ARAMA FONKS�YONU...O(N)--N:ELEMAN/D���M SAYISI*/
Ciftelemanptr listede_ara ( Ciftlisteptr l , int deger){
 Ciftelemanptr tmp;
 tmp = l->bas;
 while (tmp){
 if (tmp->icerik == deger)
 return tmp;/**aranan eleman�n adresi d�ner...*/
 tmp = tmp->ileri;
 }
 return NULL;/**aranan bulunamad� NULL d�ner...*/
 }
 main(){
 Ciftelemanptr yeni;
  Ciftlisteptr liste; 
  int icerik;/*L�STE ELEMANINA A�T ��ER�K B�LG�S�N� TUTACAK DE���KEN..*/
  char devam;
  liste= yeni_ciftliste();/*bo� liste olu�turuluyor...*/
  for(int k=5;k<=15;k=k+3){
  yeni =yeni_cifteleman(k);/*L�STEYE EKLENECEK ELEMAN OLU�TURULUYOR...*/
  listeye_ekle (liste,yeni);/*�ift ba�l� listenin sonuna eleman/dugum ekleme fonksiyonu �a��r�l�yor...*/
}
printf("Liste :");
listeyi_yaz(liste);	
int sayi;
printf("\nListenin basina eklenecek sayiyi giriniz");
scanf("%d",&sayi);
yeni =yeni_cifteleman(sayi);
liste_basina_ekle (liste,yeni);
printf("\nYeni Liste :");
listeyi_yaz(liste);	
printf("\nListeye  eklenecek yeni sayinizi giriniz");
int y;
scanf("%d",&y);
yeni =yeni_cifteleman(y);
printf("\nListeye hangi sayidan sonraya ekleme yap�lacak?");
scanf("%d",&sayi);
Ciftelemanptr once=listede_ara (liste,sayi);//onceki eleman�n adresi
if(once!=NULL){
	//eleman bulundu eklenecek say� bu elemandan sonraya gelecek...
liste_orta_ekle (yeni ,once);	
	
}
else{
	printf("listeye ekleme yapilamadi...");
}
printf("\nSon Liste :");
listeyi_yaz(liste);
 }
 

