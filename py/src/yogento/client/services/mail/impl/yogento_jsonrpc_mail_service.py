from datetime import datetime
from itertools import ifilterfalse
from time import mktime
import __builtin__
import thryft.protocol.json_protocol
import yogento.api.models.mail.campaign.mail_campaign
import yogento.api.models.mail.campaign.mail_campaign_content
import yogento.api.models.mail.campaign.mail_campaign_stats
import yogento.api.models.mail.list.mail_list
import yogento.api.models.mail.template.mail_template
import yogento.api.models.mail.template.mail_template_info
import yogento.api.models.mail.template.mail_template_type
import yogento.api.services.mail.mail_service
import yogento.client.services._yogento_jsonrpc_service


class YogentoJsonrpcMailService(yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService, yogento.api.services.mail.mail_service.MailService):
    def __init__(self, api_url, headers=None):
        api_url = api_url.rstrip('/')
        if not api_url.endswith('/jsonrpc/mail'):
            api_url += '/jsonrpc/mail'
        yogento.client.services._yogento_jsonrpc_service._YogentoJsonrpcService.__init__(self, api_url=api_url, headers=headers)

    def _delete_mail_campaign(self, **kwds):
        return self._request('delete_mail_campaign', **kwds)

    def _get_mail_campaign_content(self, **kwds):
        return_value = self._request('get_mail_campaign_content', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.mail.campaign.mail_campaign_content.MailCampaignContent.read(iprot)

    def _get_mail_campaign(self, **kwds):
        return_value = self._request('get_mail_campaign', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.mail.campaign.mail_campaign.MailCampaign.read(iprot)

    def _get_mail_campaigns(self, **kwds):
        return_value = self._request('get_mail_campaigns', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.mail.campaign.mail_campaign.MailCampaign.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_mail_campaign_stats(self, **kwds):
        return_value = self._request('get_mail_campaign_stats', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.mail.campaign.mail_campaign_stats.MailCampaignStats.read(iprot)

    def _get_mail_lists(self, **kwds):
        return_value = self._request('get_mail_lists', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.mail.list.mail_list.MailList.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_mail_templates(self, **kwds):
        return_value = self._request('get_mail_templates', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return frozenset([yogento.api.models.mail.template.mail_template.MailTemplate.read(iprot) for _ in xrange(iprot.readSetBegin()[1])] + (iprot.readSetEnd() is None and []))

    def _get_mail_template_info(self, **kwds):
        return_value = self._request('get_mail_template_info', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.mail.template.mail_template_info.MailTemplateInfo.read(iprot)

    def _post_mail_campaign(self, **kwds):
        return_value = self._request('post_mail_campaign', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.mail.campaign.mail_campaign.MailCampaign.read(iprot)

    def _put_mail_campaign(self, **kwds):
        return_value = self._request('put_mail_campaign', **kwds)
        iprot = thryft.protocol.json_protocol.JsonProtocol(return_value)
        return yogento.api.models.mail.campaign.mail_campaign.MailCampaign.read(iprot)

    def _put_mail_campaign_content(self, **kwds):
        self._request('put_mail_campaign_content', **kwds)

