package org.artifactory.client.model.builder;

import org.artifactory.client.model.Item;

/**
 * @author jbaruch
 * @since 13/08/12
 */
public interface ItemBuilder {


    ItemBuilder uri(String uri);

    ItemBuilder isFolder(boolean folder);

    Item build();


}
