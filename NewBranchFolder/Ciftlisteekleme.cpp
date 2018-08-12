/*çift yönlü doðrusal baðlý liste ve fonksiyonlarý*/
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
/*CÝFT BAÐLI LÝSTE YAPISI TANIMI*/
typedef struct ciftliste {
Ciftelemanptr bas;
Ciftelemanptr son;
} Ciftliste ;
typedef Ciftliste * Ciftlisteptr ;
//YENÝ ELEMAN OLUSTURMA FONKSÝYONU
Ciftelemanptr yeni_cifteleman( int icerik ){
Ciftelemanptr eleman;
eleman = (Ciftelemanptr)malloc(sizeof(Cifteleman ));
eleman->icerik = icerik;
eleman->ileri = NULL;
eleman->geri = NULL;
return eleman;
}
//YENÝ ÇÝFT BAÐLI LÝSTE OLUSTURMA FONKSÝYONU
Ciftlisteptr yeni_ciftliste (){
Ciftlisteptr liste ;
liste =(Ciftlisteptr) malloc( sizeof ( Ciftliste ));
liste ->bas = NULL;
liste ->son = NULL;
}
//baþa ekleme fonksiyonu...O(1)
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
 	//Bu hatayý Ciftliteekleme_2.cpp programýnda düzeltiyoruz...
 yeni->ileri = once->ileri;
 yeni->geri = once;
 once->ileri->geri = yeni;
 once->ileri = yeni;
 }
void listeyi_yaz(Ciftlisteptr liste){
Ciftelemanptr tmp;
 /*YAZDIRMA LÝSTE BAÞINDAN LÝSTENÝN SONUNA KADAR ...O(N)--N:ELEMAN/DÜÐÜM SAYISI*/
 tmp = liste->bas;
 while (tmp!=NULL){
 printf("\nListedeki sayi:%d",tmp->icerik);
 tmp = tmp->ileri;
 }
 printf("\n devam icin bir tusa basiniz...");
 getch();
}
 /*ÇÝFT BAÐLI LÝSTEDE ELEMAN ARAMA FONKSÝYONU...O(N)--N:ELEMAN/DÜÐÜM SAYISI*/
Ciftelemanptr listede_ara ( Ciftlisteptr l , int deger){
 Ciftelemanptr tmp;
 tmp = l->bas;
 while (tmp){
 if (tmp->icerik == deger)
 return tmp;/**aranan elemanýn adresi döner...*/
 tmp = tmp->ileri;
 }
 return NULL;/**aranan bulunamadý NULL döner...*/
 }
 main(){
 Ciftelemanptr yeni;
  Ciftlisteptr liste; 
  int icerik;/*LÝSTE ELEMANINA AÝT ÝÇERÝK BÝLGÝSÝNÝ TUTACAK DEÐÝÞKEN..*/
  char devam;
  liste= yeni_ciftliste();/*boþ liste oluþturuluyor...*/
  for(int k=5;k<=15;k=k+3){
  yeni =yeni_cifteleman(k);/*LÝSTEYE EKLENECEK ELEMAN OLUÞTURULUYOR...*/
  listeye_ekle (liste,yeni);/*çift baðlý listenin sonuna eleman/dugum ekleme fonksiyonu çaðýrýlýyor...*/
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
printf("\nListeye hangi sayidan sonraya ekleme yapýlacak?");
scanf("%d",&sayi);
Ciftelemanptr once=listede_ara (liste,sayi);//onceki elemanýn adresi
if(once!=NULL){
	//eleman bulundu eklenecek sayý bu elemandan sonraya gelecek...
liste_orta_ekle (yeni ,once);	
	
}
else{
	printf("listeye ekleme yapilamadi...");
}
printf("\nSon Liste :");
listeyi_yaz(liste);
 }
 

