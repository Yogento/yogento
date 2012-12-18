from itertools import ifilterfalse
import __builtin__
import thryft.protocol.json_protocol
import thryft.protocol.string_map_protocol
import yogento.api.models.catalog.product.magento.magento_product
import yogento.api.services.agent.agent_service
import yogento.client.services._yogento_rest_service


class YogentoRestAgentService(yogento.client.services._yogento_rest_service._YogentoRestService, yogento.api.services.agent.agent_service.AgentService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/rest/'):
            api_url += '/rest/'
        yogento.client.services._yogento_rest_service._YogentoRestService.__init__(self, api_url=api_url, headers=headers)

    def _get_agent_magento_products(self, **kwds):
        __return_value = self._request('GET', '/agent/magento_products', data=None, query=thryft.protocol.string_map_protocol.StringMapProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None)).to_string_map())
        iprot = thryft.protocol.json_protocol.JsonProtocol(__return_value)
        return frozenset([yogento.api.models.catalog.product.magento.magento_product.MagentoProduct.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _put_agent_magento_products(self, **kwds):
        self._request('PUT', '/agent/magento_products', data=str(thryft.protocol.json_protocol.JsonProtocol().writeMixed(dict((key, value) for key, value in kwds.iteritems() if value is not None))), query=None)
