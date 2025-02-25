package tourism.repository;

import org.springframework.stereotype.Repository;
import tourism.model.Byer;
import tourism.model.TouristAttraction;

import java.util.ArrayList;
import java.util.List;

@Repository
public class TouristRepository {

    private List<TouristAttraction> touristAttractions;
    TouristAttraction touristAttraction;

    public TouristRepository() {
        touristAttractions = new ArrayList<>();
        addAttraction(new TouristAttraction("Den Lille Havfrue",
                "Edvard Eriksens skulptur gør ikke meget væsen af sig, men den yndige havfrue formår alligevel at tiltrække tusindvis af beundrere år efter år. Turister flokkes ofte om den lille skulptur, som har taget plads på en sten i vandkanten.\n" +
                        "\n" +
                        "Skulpturen Den lille Havfrue blev opstillet den 23. august 1913 på Langelinje i København som en gave til Københavns Kommune. Den gavmilde giver var Carl Jacobsen – søn af J.C. Jacobsen, som grundlagde en anden københavnsk verdensstjerne; nemlig bryggeriet Carlsberg.\n" +
                        "\n" +
                        "Ud over at være med til at gøre Carlsberg til en succes var Carl Jacobsen kendt som en stor kunstelsker, som har sat sit tydelige præg på Danmark. Ikke bare mens han levede og gav offentligheden adgang til sin imponerende kunstsamling, men i høj grad også, fordi han stiftede Ny Carlsbergfondet, så hans engagement for kunsten kunne leve videre. Faktisk er det bl.a. derfor vi i dag kan besøge Ny Carlsberg Glyptoteket - en anden af Københavns populære attraktioner.\n" +
                        "\n" +
                        "Skulpturen af Den Lille Havfrue er udført i bronze og granitsten og inspireret af H.C. Andersens eventyr om havfruen, der ofrer alt for at blive forenet med den unge, smukke prins på landjorden. Hver morgen og hver aften stiger hun op fra havets bund, og fra sin sten i vandet spejder hun længselsfuldt efter prinsen. Historien om Den Lille Havfrue kender mange børn i dag fra ikke bare den oprindelige version af H.C. Andersen men også Disney’s version af samme navn.\n" +
                        "\n" +
                        "Forelskede sig\n" +
                        "\n" +
                        "Brygger Carl Jacobsen forelskede sig i figuren efter at have set en balletforestilling bygget over eventyret på Det Kongelige Teater i København. Jacobsen var så begejstret for både eventyret og balletten, at han bestilte billedhuggeren Edvard Eriksen til at udføre en skulptur af havfruen.\n" +
                        "\n" +
                        "Inspireret af en ballerina Skulpturen er inspireret af ballerina Ellen Price, der i 1909 dansede hovedrollen i balletten Den Lille Havfrue på Det Kongelige Teater. Ellen Price ønskede dog ikke at sidde nøgenmodel for billedhugger Edvard Eriksen. Så kunstnerens kone, Eline Eriksen, sad i stedet model til skulpturen af Den lille Havfrue.\n" +
                        "\n" +
                        "Den hovedløse havfrue\n" +
                        "\n" +
                        "Gennem årene har den efterhånden aldrende dame på kajen desværre været udsat for flere omgange hærværk. To gange har hun mistet hovedet, en enkelt gang er armen blevet savet af, og flere gang har hun fået maling hældt ud over sig. Men hver gang bliver hun reddet og renset, så hun kan blive på sin plads og byde rejsende velkommen i Københavns havn.\n" +
                        "\n" +
                        "Det kan du opleve i nærheden\n" +
                        "\n" +
                        "Lægger du vejen forbi Den Lille Havfrue på Langelinie, kan du passende afsætte tid til en gåtur på det smukke Kastellet og så gå forbi den Danske Kongefamilies residens, Amalienborg Slot på vej ind til centrum. I gåafstand fra Den Lille Havfrue finder du desuden Restaurant Lumskebugten, som er i topklasse, når det kommer til en god, dansk frokost eller middag.",
                "denLilleHavfrue.webp",
                List.of("Kultur", "Statue"),
                Byer.KØBENHAVN)
        );


        addAttraction(new TouristAttraction("Tivoli",
                "Tivoli blev grundlagt i 1843 og er en national skat og en international attraktion. Eventyrforfatter H.C. Andersen besøgte haven mange gange, og det samme gjorde Walt Disney. Det siges endda at Walt Disney fandt inspiration i netop Tivoli til sin første Disney World. Da Tivoli blev grundlagt lå parken udenfor Vesterport, men i dag ligger den kun få minutters gang fra Rådhuspladsen, og med Københavns Hovedbanegård som nærmeste nabo, så det er let at komme dertil.\n" +
                        "\n" +
                        "En del af hemmeligheden bag Tivolis succes er, at der er noget for enhver smag. Den gamle have er smukkere end nogen anden forlystelsespark med eksotisk arkitektur, historiske bygninger og frodige haver. Om aftenen skaber tusindvis af farvede lys en eventyrlig atmosfære, der er helt unik. Charmen ved den gamle have ligger også i dens finurligheder, som når du støder på de fritgående perlehøns eller de majestætiske påfugle der går rundt mellem rutsjebaner og karuseller.\n" +
                        "\n" +
                        "Magiske og nostalgiske forlystelser\n" +
                        "Forlystelserne er alle designet til at matche Tivolis arkitektur og haver. Nogle er vidunderligt nostalgiske, mens andre er de rene adrenalinsus. Tivolis ældste og mest populære tur er trærutsjebanen fra 1914, og er en af kun syv rutsjebaner i verden, der endnu har en mand ombord, som manuelt styrer bremserne. I kontrast hertil finder du for eksempel Vertigo, der flyver med 100 km/t. Den blev kåret til Europas Bedste Forlystelse i 2014.\n" +
                        "\n" +
                        "I 2021 åbnede Tivolis seneste forlystelse, Villa Vendetta, Danmarks største spøgelseshus med skuespillere. Gæsterne at tage på en rejse gennem 12 forskellige værelser, fordelt på over 800 skræmmende kvadratmeter.\n" +
                        "\n" +
                        "Fredagsrock og klassisk musik i verdensklasse\n" +
                        "Det årlige musikprogram i Tivoli byder altid på noget for enhver smag og alder - med blandt andet Fredagsrock og SommerKlassisk. Der er live musik i Tivoli hver eneste dag, og Fredagsrock har endda fået en lillebror.  Han hedder 'Lillefredag', og fyrer op for ny dansk musik hver torsdag. \n" +
                        "\n" +
                        "Herudover er der Mundomandag med musik fra alle verdenshjørner, Tirsdagstoner med danske sange og evergreens samt Onsdagsjazz. Lørdag aften står på dans på Plænen, hvor Tivolis Big Band og Tivoli Late Night Orchestra sætter gang i en dansefest, hvor både amatører og dygtige dansere kan være med. \n" +
                        "\n" +
                        "Se Tivolis musikkalender her.\n" +
                        "\n" +
                        "Spisning i Tivoli\n" +
                        "Når det kommer til mad, har Tivoli et godt og varieret udbud. Nogle foretrækker at medbringe deres egen mad og lave en picnic på Plænen, men du kan også vælge mellem Tivolis mange gode restauranter. Du kan finde alt fra traditionelle danske retter til fransk bistro til gourmet burgere. I år har Tivoli åbnet en ny fiskebistro, Figaro og Gasoline Grill, den verdensberømte burgerkæde.\n" +
                        "\n" +
                        "Er du mere til en streetfood udgave af frokosten, så besøg Tivoli Food Hall i Tivoli Hjørnet. Bygningen på hjørnet af Vesterbrogade og Bernstorffsgade blev opført af Tivoli i 2017, og er tegnet af arkitekterne bag Louvre Pyramiderne i Paris. Bag den bølgende facade gemmer sig flere spisesteder, de fleste indrettet som permanente, indendørs madboder. Her er et bredt udvalg af forskellige køkkener, og du kan nyde alt fra sunde retter hos islandske Glò til nordafrikanske, lune fladbrød hos Wakha. Og en væld af muligheder derimellem.  \n" +
                        "\n" +
                        "Du kan også prøve det fine Nimb Brasserie og Nimb Hotel, som ligger i Tivoli. Deres nyeste tilføjelser er restaurant Gemyse, der fokuserer på det grønne køkken og økologi i samarbejde med Aarstiderne, og Cakenhagen, der serverer kaffe, kager og champagne.\n" +
                        "\n" +
                        "Vil du se flere gode spisesteder i denne del af København? Så tjek vores guide til de bedste spisesteder i Indre By. \n" +
                        "\n" +
                        "Tivoli hele året\n" +
                        "Med tiden har Tivoli udvidet deres åbne sæsoner. Du kan nyde have på en smuk sommerdag, eller ligge turen forbi, når Tivoli hvert efterår bliver forvandlet til et fortryllet Halloween-univers med hekse, græskar og lanterner.\n" +
                        "\n" +
                        "Fra midten af november til januar sænker julefreden sig over Tivoli, der fejrer jul og nytår - og huser Københavns mest magiske julelandskab og- marked.\n" +
                        "\n" +
                        "De fleste forlystelser kører, og restauranterne er åbne også til efterår, jul og nytår.",
                "tivoli.webp",
                List.of("Kultur", "Park", "Forlystelser"),
                Byer.KØBENHAVN)
        );


        addAttraction(new TouristAttraction("Zoologisk Have", "I ZOO kan du møde mere end 4000 fascinerende dyr og krydse kontinenter i en trækvogn.\n" +
                "\n" +
                "Kom helt tæt på de ikoniske pandaer og spis synkront med de bambusspisende bjørne i det storslåede Pandaanlæg. Kom så tæt på isbjørnene, at du får kuldegysninger og se verden fra oven som en giraf. Fyld hjernen med overraskende viden og maven med sunde måltider. ZOO er fyldt med opdagelser hver dag 365 dage om året. Alverdens opdagelser venter.  \n" +
                "\n" +
                "Nye restauranter i Zoologisk Have \n" +
                "\n" +
                "På Bistro Panpan kan du nyde franske retter med et asiatisk tvist i med udsigt til de nye beboere i Pandaanlægget. Hos Cakes & Dreams kan du sætte tænder i lækre kager, og hos Spisehuset FOLK finder du en hyggelig og klassisk dansk restaurant, som serverer traditionelle danske retter så som smørrebrød.        \n" +
                "\n" +
                "Arkitektur i Københavns Zoo\n" +
                "\n" +
                "Dyrene er ikke det eneste, man kan beundre i zoologisk have. Zoo er også hjemsted for nogle arkitektoniske lækkerier, ikke mindst pandaanlægget, der er designet af Bjarke Ingels Group, og elefanthuset, der er designet af Norman Foster. Arkitekturfans vil måske også nyde at se Flodhestehuset, som åbnede i 2007 med vægge mønstret som en flodhests hud, og Den Arktiske Ring, som giver dig mulighed for at se isbjørnene svømme under vandet.\n" +
                "\n" +
                "Tjek dagens program før dit besøg på zoo.dk", "zoologiskHave.jpg",
                List.of("Natur", "Park", "Dyr"),
                Byer.KØBENHAVN)
        );


        addAttraction(new TouristAttraction("Den Blå Planet",
                "Den Blå Planet, Danmarks Akvarium har vand på alle sider og giver dig en fornemmelse af at være under havets overflade. Arkitekturen er inspireret af en hvirvelstrøm og består af fem \"arme\", der kommer hele kloden rundt. Besøg Færøernes stejle fuglefjeld, de legesyge havoddere fra Alaska eller den smukke Stillehavsblæksprutte. I det varme vand kan du se farverige koralrevsfisk, mærkelige skabninger fra søer og floder i Afrika eller nyde kronjuvelen: Den smukke Oceantank. Den Blå Planet er hjem for mere end 400 forskellige dyrearter fra hele verden.\n" +
                        "\n" +
                        "Oceantanken, vandlegepladsen og den tropiske regnskov\n" +
                        "\n" +
                        "I Oceantanken lever majestætiske hammerhajer og elegante rokker, som du kan komme helt tæt på i undervandstunnelen.\n" +
                        "\n" +
                        "Bliv klogere på det lokale dyre- og naturliv i Det Vilde Vandhul, hvor Den Blå Planets fortællere står klar til at hjælpe med at identificere de forskellige dyr, der lever i søen.\n" +
                        "\n" +
                        "Slip din indre vandhund løs på vandlegepladsen, og giv den fuld gas med pumperne og sluserne. Gennem fysisk aktivitet og samarbejde får du en større forståelse for vand. Eller prøv kræfter med den mere traditionelle legeplads med klatrestativer, armgang og rutsjebane.\n" +
                        "\n" +
                        "Du kan også gå på opdagelse i den tropiske regnskov, hvor arapaimerne og piratfiskene hersker. Se godt efter! Små frøer gemmer sig i buskadserne.\n" +
                        "\n" +
                        "Et besøg på Den Blå Planet er en unik oplevelse, hvor underholdning, fascination og viden kombineres i spektakulære rammer.",
                "denBlåPlanet.jpeg",
                List.of("Natur", "Park", "Dyr"),
                Byer.KØBENHAVN)
        );

        addAttraction(new TouristAttraction("Jailhouse",
                "pizaaaa",
                "jailHouse.jpg",
                List.of("Byliv", "LGBTQ+"),
                Byer.KØBENHAVN)
        );
//        addAttraction("Amalienborg Slot", "sadd vodka");
    }

    public void addAttraction(TouristAttraction attraction) {
        touristAttractions.add(attraction);

    }

    public boolean removeAttraction(String name) {
        for (TouristAttraction attraction : touristAttractions) {
            if (attraction.getName().equals(name)) {
                touristAttractions.remove(attraction);
                return true;
            }
        }
        return false;
    }


    public TouristAttraction editAttraction(String name, String newDescription, String imagePath, List<String> tags, Byer by) {

        for (TouristAttraction attraction : touristAttractions) {
            if (attraction.getName().equals(name)) {
                attraction.setDescription(newDescription);
                attraction.setImagePath(imagePath);
                touristAttraction = new TouristAttraction(name, newDescription, imagePath, tags, by);
            }
        }
        return touristAttraction;
    }

    public List<TouristAttraction> seeAttractions() {
        return touristAttractions;
    }

    public TouristAttraction findByName(String name) {
        for (TouristAttraction touristAttraction : touristAttractions) {
            if (touristAttraction.getName().equals(name)) {
                System.out.println(touristAttraction.getName());
                return touristAttraction;
            }
        }
        return new TouristAttraction("empty", "Attraction not found", "notFound", List.of("empty"), Byer.NULL);
    }

}
