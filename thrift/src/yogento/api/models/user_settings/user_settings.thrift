namespace java com.yogento.api.models.user_settings
namespace py yogento.api.models.user_settings

include "thryft/util/date_time.thrift"

struct UserSettings {
    optional string display_name;
    optional string email;
    optional string logo_image_url;
    optional string magento_store_url;
    optional string product_csv_file_path;
    optional date_time.DateTime product_csv_mtime;
    optional list<string> product_search_queries;
}