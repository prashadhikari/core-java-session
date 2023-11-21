package oopconcept.chaseBank;

public class Menu {

    /*
        menu id => int
        name => String
        slug => String
        is external => boolean
        external url => String
        is Active => boolean
        parent id => int
        is leaf => boolean
        language id => int
     */

    int menuID;
    String name;
    String slug;
    boolean isExternal;
    String externalUrl;
    boolean isActive;
    int parentId;
    boolean isLeaf;
    int languageId;

    @Override
    public String toString() {
        return "Menu{" +
                "menuID=" + menuID +
                ", name='" + name + '\'' +
                ", slug='" + slug + '\'' +
                ", isExternal=" + isExternal +
                ", externalUrl='" + externalUrl + '\'' +
                ", isActive=" + isActive +
                ", parentId=" + parentId +
                ", isLeaf=" + isLeaf +
                ", languageId=" + languageId +
                '}';
    }
}

/*
    menu id - 1
    name - Personal
    slug - "" //stayed on the same site that is why slug is empty
    is external - No
    external url - null
    is Active - Yes
    parent id - 0
    language id - 1

    menu id - 4
    name - Checking
    slug - null
    is external - No
    external url - null
    is Active - Yes
    parent id - 1
    is leaf - No
    language id - 1

    menu id - 5
    name - Choose a checking account
    slug - null
    is external - Yes
    external url - https://personal.chase.com/personal/checking3
    is Active - Yes
    parent id - 4
    is leaf - Yes
    language id - 1
 */

/*
    menu id - 2
    name - Business
    slug - business
    is external - No
    external url - null
    is Active - Yes
    parent id - 0
    language id - 1
 */

/*
    menu id - 3
    name - Commercial
    slug - null // took to completely different site (JP morgan) website
    is external - Yes
    external url - https://www.jpmorgan.com/commercial-banking
    is Active - Yes
    parent id - 0
    language id - 1

 */